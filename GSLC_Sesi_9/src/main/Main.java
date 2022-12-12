//PROGRAM MENYIMPAN DATA EMPLOYEE DAN MAHASISWA
package main;
import java.text.DateFormat;
import java.util.*;
import models.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	Vector<Persona> datas = new Vector<>();
	int mainMenu() {
		int a;
		while(true) {
			System.out.println("Sunib University");
			System.out.println("1. View Data");
			System.out.println("2. Insert Data");
			System.out.println("3. Delete Data");
			System.out.println("4. Exit");
			System.out.print(">> ");
			try {
				a=sc.nextInt();
				sc.nextLine();
				if(a>=1 && a<=4) {
					return a;
				}
				//warning jika input tidak sesuai pilihan
				else {
					System.out.println("Input must be between [ 1 - 5 ]");
				}
			//catch untuk menghindari error jika user menginput character atau string agar tidak terjadi error input mismatch
			} catch (Exception e) {
				System.out.println("You must input number");
				sc.nextLine();
			}
		}
	}
	
	int mainMenu2() {
		int a;
		while(true) {
			System.out.println("1. Student");
			System.out.println("2. Lecturer");
			System.out.println("3. Staff");
			System.out.println("4. Teaching Assistant");
			System.out.println("5. Return to main menu");
			System.out.print(">> ");
			try {
				a=sc.nextInt();
				sc.nextLine();
				if(a>=1 && a<=5) {
					return a;
				}
				//warning jika input tidak sesuai pilihan
				else {
					System.out.println("Input must be between [ 1 - 5 ]");
				}
			//catch untuk menghindari error jika user menginput character atau string agar tidak terjadi error input mismatch
			} catch (Exception e) {
				System.out.println("You must input number");
				sc.nextLine();
			}
		}
	}
	
	void view() {
		int a=1;
		for (var data : datas) {
			System.out.println(a + " "+data);
		}
	}
	
	//PROGRAM UTAMA
	@SuppressWarnings("deprecation")
	public Main() {
		int menu;
		mainMenuLoop:
		while(true) {
			menu=mainMenu();
			//MENU1 VIEW DATA
			if(menu==1) {
				//klo data kosong, tampilin warning message doang
				if(datas.isEmpty()) {
					System.out.println("No data yet");
				}
				//kalo ada data, tampilin datanya
				else {
					view();
				}
			}
			//MENU2 INSERT DATA
			//tidak ada validasi (asumsi insert data sesuai dan tidak ada error)
			else if(menu==2) {
				int menu2;
				while(true) {
					System.out.println("1. Student");
					System.out.println("2. Lecturer");
					System.out.println("3. Staff");
					System.out.println("4. Teaching Assistant");
					System.out.println("5. Exit");
					menu2=mainMenu2();
					//Insert student
					if(menu2==1) {
//						name, address, phone, email, status
						String name,address,phone,email,status;
						System.out.print("Input student name: ");
						name=sc.nextLine();
						System.out.print("Input student address: ");
						address=sc.nextLine();
						System.out.print("Input student phone: ");
						phone=sc.nextLine();
						System.out.print("Input student email [ @gmail.com ]: ");
						email=sc.nextLine();
						System.out.print("Input student status [ Active | non-Active ]: ");
						status=sc.nextLine();
						datas.add(new Student(name, address, phone, email, status));
					}
					//Insert lecturer 
					else if(menu2==2) {
//						String name, String address, String phone, String email, String position, String office,
//						String shift, int salary, Date recruitedDate
						String name, address, phone, email, office, shift, position;
						Date recruitedDate;
						int salary;
						System.out.print("Input lecturer name: ");
						name=sc.nextLine();
						System.out.print("Input lecturer address: ");
						address=sc.nextLine();
						System.out.print("Input lecturer phone: ");
						phone=sc.nextLine();
						System.out.print("Input lecturer email [ @gmail.com ]: ");
						email=sc.nextLine();
						System.out.print("Input lecturer position: ");
						position=sc.nextLine();
						System.out.print("Input lecturer office room: ");
						office=sc.nextLine();
						System.out.print("Input lecturer shift [ Morning | Night ]: ");
						shift=sc.nextLine();
						System.out.print("Input lecturer salary: ");
						salary=sc.nextInt();sc.nextLine();
						System.out.print("Input lecturer recruited date: ");
						recruitedDate= new Date(sc.nextLine());
						datas.add(new Lecturer(name, address, phone, email, position, office, shift, salary, recruitedDate));
					}
					//Insert staff 
					else if(menu2==3) {
//						String name, String address, String phone, String email, String position, String office,
//						String shift, int salary, Date recruitedDate
						String name, address, phone, email, office, shift, position;
						Date recruitedDate;
						int salary;
						System.out.print("Input lecturer name: ");
						name=sc.nextLine();
						System.out.print("Input lecturer address: ");
						address=sc.nextLine();
						System.out.print("Input lecturer phone: ");
						phone=sc.nextLine();
						System.out.print("Input lecturer email [ @gmail.com ]: ");
						email=sc.nextLine();
						System.out.print("Input lecturer position: ");
						position=sc.nextLine();
						System.out.print("Input lecturer office room: ");
						office=sc.nextLine();
						System.out.print("Input lecturer shift [ Morning | Night ]: ");
						shift=sc.nextLine();
						System.out.print("Input lecturer salary: ");
						salary=sc.nextInt();sc.nextLine();
						System.out.print("Input lecturer recruited date: ");
						recruitedDate= new Date(sc.nextLine());
						datas.add(new Staff(name, address, phone, email, position, office, shift, salary, recruitedDate));
					}
					//Insert teaching assistant
					else if(menu2==4) {
//						String name, String address, String phone, String email, String position, String office,
//						String shift, int salary, Date recruitedDate
						String name, address, phone, email, office, shift, position;
						Date recruitedDate;
						int salary;
						System.out.print("Input lecturer name: ");
						name=sc.nextLine();
						System.out.print("Input lecturer address: ");
						address=sc.nextLine();
						System.out.print("Input lecturer phone: ");
						phone=sc.nextLine();
						System.out.print("Input lecturer email [ @gmail.com ]: ");
						email=sc.nextLine();
						System.out.print("Input lecturer position: ");
						position=sc.nextLine();
						System.out.print("Input lecturer office room: ");
						office=sc.nextLine();
						System.out.print("Input lecturer shift [ Morning | Night ]: ");
						shift=sc.nextLine();
						System.out.print("Input lecturer salary: ");
						salary=sc.nextInt();sc.nextLine();
						System.out.print("Input lecturer recruited date: ");
						recruitedDate= new Date(sc.nextLine());
						datas.add(new TeachingAssistant(name, address, phone, email, position, office, shift, salary, recruitedDate));
					}
					//return to main menu
					else if(menu2==5) {
						continue mainMenuLoop;
					}
				}
			}
			//MENU3 DELETE DATA
			else if(menu==3) {
				//klo data kosong, tampilin warning message doang
				if(datas.isEmpty()) {
					System.out.println("No data yet");
				}
				//kalo ada data, tampilin datanya dan pilih data yang mau diupdate
				else {
					view();
					int deleteIdx;
					while(true) {
						System.out.print("Update Data [ 1 - "+datas.size()+" ], choose '0' to go back to main menu: ");
						deleteIdx=sc.nextInt();sc.nextLine();
						if(deleteIdx>=0 && deleteIdx<=datas.size()) {//validasi biar ga index out of bounds
							if(deleteIdx==0) {
								continue mainMenuLoop;//balik ke main menu
							}
							else {
								//DELETE DATA NYA, PAKE .remove UNTUK DELETE SESUAI INDEX YANG DIPILIH
								System.out.println("You have successfully delete "+datas.get(deleteIdx-1).getName()+" data");
								datas.remove(deleteIdx-1);
								break;
							}
						}
					}
				}
			}
			//MENU4 EXIT
			if(menu==4) {
				System.out.println("Goodbye...");
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
