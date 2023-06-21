package hust.soict.ict.aims;

import java.util.Scanner;

import hust.soict.ict.aims.Cart.Cart;
import hust.soict.ict.aims.Media.Book;
import hust.soict.ict.aims.Media.CompactDisc;
import hust.soict.ict.aims.Media.DigitalVideoDisc;
import hust.soict.ict.aims.Media.Media;
import hust.soict.ict.aims.Media.Track;
import hust.soict.ict.aims.Store.Store;

public class Aims {

	public static void main(String args[]){
		Store store = new Store();
		Cart cart = new Cart();

		Scanner scanner = new Scanner(System.in);
		int noexit = 1;
		int option;
		int itemId=1;
		int nbItemsInCart=0;

		do {
			showMenu();
			option = scanner.nextInt();scanner.nextLine();

			if (option == 1){
				int option1;
				do {
					store.print();
					storeMenu();
					option1=scanner.nextInt();scanner.nextLine();

					//option of menu1
					if (option1 == 1){

						System.out.println("Enter media title: ");
						String title = scanner.nextLine();
						mediaDetailsMenu();
						Media media = store.searchMedia(title);

						
						if (media == null){
							System.out.println("The media does not exist in the store\n");
							option=0;

						}
						else {
							System.out.println(media.toString());
							mediaDetailsMenu();
							int option11 = scanner.nextInt();scanner.nextLine();
							do {
								if (option11 == 1){
									System.out.println("Enter the title of the media you want to add: ");
									String add = scanner.nextLine();
									Media a = store.searchMedia(add);
									if (a==null){
										System.out.println("The title is incorrect\n");
									}
									else {
										cart.addMedia(a);
										System.out.println("The media has been added to the cart\n");
										nbItemsInCart++;
										System.out.println("Numbers of items in cart: "+nbItemsInCart);
									}
									option11 =0;

								}
								else if(option11==2){
									if (media instanceof Book) {
										System.out.println("You cannot play a book.");
									}
									else if (media instanceof CompactDisc){
										((CompactDisc)media).play();
									}
									else {
										((DigitalVideoDisc)media).play();
									}
									break;
								}
								else {
									System.out.println("Invalid option. Re-enter the option: ");

								}

							} while (option11 != 0);
						}
					}

					//option2 of menu1
					else if(option1==2){
						System.out.println("Enter the title of the media you want to add: ");
						String add = scanner.nextLine();
						Media a = store.searchMedia(add);
						if (a==null){
							System.out.println("The title is incorrect\n");
						}
						else {
							cart.addMedia(a);
							System.out.println("The media has been added to the cart\n");
							nbItemsInCart++;
							System.out.println("Numbers of items in cart: "+nbItemsInCart);
						}
					}

					//option3 of menu1
					else if(option1==3){
						System.out.println("Enter the title of the media you want to play: ");
						String play = scanner.nextLine();

						Media media = store.searchMedia(play);
						if (media == null){
							System.out.println("The input title is not available in the store!\n");
						}
						else {
							if (media instanceof Book) {
								System.out.println("You cannot play a book.");
							}
							else if (media instanceof CompactDisc){
								((CompactDisc)media).play();
							}
							else {
								((DigitalVideoDisc)media).play();
							}
						}
					}

					else if (option1==4){
						cart.print();
					}

					

				} while (option1 !=0 );


			}
			else if (option == 2){
				int option2;
				do {
					System.out.println("Do you want to ...\n");
					System.out.println("1. Add media\n");
					System.out.println("2. Remove media\n");
					System.out.println("0. Back\n");
					System.out.println("Enter option: ");
					option2= scanner.nextInt();scanner.nextLine();
					if(option2 == 1){
						System.out.println("Enter the type of media: ");

						String type = scanner.nextLine();
						System.out.println("Enter title: "); String title = scanner.nextLine();
						System.out.println("Enter category: "); String category = scanner.nextLine();
						System.out.println("Enter price: "); float cost = scanner.nextFloat();scanner.nextLine();
						if (type.equals("book")){
							Book book = new Book(itemId, title, category, cost);
							System.out.println("Enter number of authors: "); int nbAuthors = scanner.nextInt();scanner.nextLine();
							for (int i=1;i<=nbAuthors;i++){
								System.out.println("Enter author's name: ");
								String author = scanner.nextLine();
								book.addAuthors(author);
							}
							store.addMedia(book);
							itemId++;
		
		
						}
						else if (type.equals("cd")){
							System.out.println("Enter director: "); String director = scanner.nextLine();
							System.out.println("Enter aritist: "); String artist = scanner.nextLine();
							System.out.println("Enter number of tracks: "); int nbTracks = scanner.nextInt();scanner.nextLine();
		
							CompactDisc cd = new CompactDisc(itemId, title, category, cost, director, artist);
		
							for (int i=1;i<=nbTracks;i++){
								System.out.println("Enter track # " + i + "title: "); String ttitle = scanner.nextLine();
								System.out.println("Enter track # " + i + "length: "); int tlength = scanner.nextInt();scanner.nextLine();
								cd.addTrack(new Track(ttitle, tlength));
							}
							store.addMedia(cd);
							itemId++;
		
						}
		
						else {
							System.out.println("Enter director: "); String director = scanner.nextLine();
							System.out.println("Enter length: "); int length = scanner.nextInt();scanner.nextLine();
							DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
							store.addMedia(dvd);
							itemId++;
		
		
						}
					}
					else if (option2==2){
						System.out.println("Enter the title of the media you want to remove: ");
						String title=scanner.nextLine();
						Media found = store.searchMedia(title);
						if (found == null){
							System.out.println("Cannot find the media with that title to remove\n");
						}
						else {
							store.removeMedia(found);
							System.out.println("Removed\n");
						}
					}
				} while (option2!=0);
				
			}

			else if (option == 3) {

				do {
					cartMenu();
					option = scanner.nextInt();scanner.nextLine();
					if (option == 1){
						System.out.println("Enter title: ");
						String title = scanner.nextLine();
						cart.searchTitle(title);
					}
					else if (option==2){
						System.out.println("Enter id: ");
						int id = scanner.nextInt();scanner.nextLine();
						cart.searchId(id);
					}
					else if (option ==3){
						System.out.println("Enter title: ");
						String title = scanner.nextLine();
						Media found = cart.searchMedia(title);
						if (found == null){
							System.out.println("The media is not in the cart ");

						}
						else {
							cart.removeMedia(found);
							System.out.println("Removed ");

						}
					}
					else if (option == 4){
						System.out.println("Enter title: ");
						String title = scanner.nextLine();
						Media found = cart.searchMedia(title);
						if (found == null){
							System.out.println("The media is not in the cart ");

						}
						else {
							if (found instanceof Book) System.out.println("Cannot play a book ");
							else if (found instanceof DigitalVideoDisc) ((DigitalVideoDisc)found).play();
							else ((CompactDisc)found).play();
						} 
					}
					else if (option == 5){
						System.out.println("An order is created\n");
						cart.emptyCart();
					}
					else {
						System.out.println("INVALID OPTION ");
					}
				} while (option != 0);
			}

			else if (option == 0){
				noexit=0;
			}

			else {
				System.out.println("Invalid option. Re-enter the option: ");
			}
		} while (noexit != 0);

	}

	public static void showMenu() {
		System.out.println("AIMS:");
		System.out.println("----------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("----------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options:");
		System.out.println("----------------------");
		System.out.println("1. See a media's detail");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("----------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void cartMenu() {
		System.out.println("Options:");
		System.out.println("----------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("----------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("----------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("----------------------");
		System.out.println("Please choose a number: 0-1-2");
	}

}
