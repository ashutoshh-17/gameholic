
import java.util.*;
class publication
{
          private String title;
          private int price;
          private int copies;
          private int total;
     Scanner sc=new Scanner(System.in);
  public void settitle(String title)
 {
    this.title=title;
 }
  public void setcopies(int copies)
 {
      this.copies=copies;
  }
   public String gettitle()
 {
   return title;
 }
   public int getTotal() 
 {
   return total;
 }
   public int getCopies() 
 {
   return copies;
 }
   public int getprice()
 {
   return price;
 }
 void read_publ() {
    System.out.print("Enter title: ");
    title = sc.next();

    // Input validation for price
    boolean validPrice = false;
    do {
        try {
            System.out.print("Enter price: ");
            price = sc.nextInt();
            validPrice = true;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer for price.");
            sc.nextLine(); // Consume the invalid input
        }
    } while (!validPrice);
  
    // Input validation for copies
    boolean validCopies = false;
    do {
        try {
            System.out.print("Enter copies: ");
            copies = sc.nextInt();
            validCopies = true;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer for copies.");
            sc.nextLine(); // Consume the invalid input
        }
    } while (!validCopies);
}
  void display()
 {
   System.out.print(title+"\t"+price+"\t"+copies);
 }
  void sale_copy(int number)
 {
   if (number <= copies)
{
  copies=copies-number;
  total=total + number*price;
  System.out.println("\tYOU PURCHASED "+number +" COPIES \n\tYOU HAVE TO PAY : "+(price*number));
}
 else

  System.out.println("INSUFFICIENT STOCK!!!!!!!!!");
  }
}

class book extends publication 
{
  private String author;

  void order_copies(int number)
 {
    int x=getCopies()+number;
    setcopies(getCopies()+number);

   System.out.println("\n\tORDER SUCESSFUL....");
   System.out.println("\tCOPIES AVAILABLE : "+x);
 }
  void read_book()
 {
   read_publ();
   System.out.print("enter author book: ");
   author=sc.next();
  }
  void display_book()
{
   System.out.println("title \tprice \tcopy \tauthor");
   display();
   System.out.println("\t"+author);
  }
}
   class magazine extends publication
{
   private int order_qty;
private String issue_date;
void receive_issue(String new_issue_date)
{
   System.out.println("ENTER NEW COPIES ORDERED: ");
   order_qty=sc.nextInt();
   setcopies(order_qty);
   issue_date=new_issue_date;
   System.out.println("\tTHE MAGAZINE "+gettitle()+" \n\t WITH ISSUE DATE"+issue_date+"AVAILABLE");
}
  void read_mag() 
{
  read_publ();
  System.out.print("Enter THe Current Issue Date [dd/mm/yyyy]");
  issue_date=sc.next();
}
  void display_mag() 
{
   System.out.println("title \tprice \tcopy \tdate");
   display();
   System.out.println("\t"+issue_date);
  }
}
    public class Magazine 
{
  public static void main(String[] args) 
{
   Scanner sc=new Scanner(System.in);
   book b=new book();
   magazine m=new magazine();
   int outer;
   do
 {
    System.out.println("\n\n\tCHOOSE ONE OF THE FOLLOWING....\n\n\t1.BOOK \t\t\t2.MAGAZINE"+ "\n\n\t3.TOTAL SALE AMOUNT\t4.REVENUE OFPUBLICATION\n\n");
    System.out.print("Choice::");
    int k=sc.nextInt();
   int a;
aa:
   if(k==1)
 {
  do
 {
  int c;
   System.out.print("\n\t\tMENU FOR BOOK\n");
   System.out.print("\t1.read book \t\t2.display \n\t3.sale copies\t\t4.order copies");
   System.out.print("\n\tChoice::");
   c=sc.nextInt();
switch (c)
{
  case 1:System.out.println("==============================================================================\n");
  b.read_book();
  System.out.println("==============================================================================\n");
break;
  case 2:
  System.out.println("==============================================================================\n");
  b.display_book();
  System.out.println("==============================================================================\n");
break;
  case 3:
  System.out.println("==============================================================================\n");
  System.out.print("HOW MANY COPIES YOU(for customer)WANT : ");
  int n1=sc.nextInt();
  b.sale_copy(n1);
  System.out.println("==============================================================================\n");
break;
  case 4:
  System.out.println("==============================================================================\n");
  System.out.print("ENTER COPIES WANT TO ORDER(forshop): ");
  int n2=sc.nextInt();
  b.order_copies(n2);
  System.out.println("==============================================================================\n");
break;
  default:
   System.out.println("invalid");
}
   System.out.println("Do you want to continue with book section[1/0]\n\t1.YES \t\t0.NO");
   System.out.print("\tChoice::");
   a=sc.nextInt();
 if(a==0)
  break aa;
 }  while(a==1);
}
  else if(k==2)
{
  mm:
do
 {
   System.out.println("\n\t\tMENU FOR MAGAZINE...\n\n\t1.READ\t\t2.DISPLAY \n\t3.SALE MAGAZINE COPIES \t4.RECEIVE NEW ISSUE\n");
   int d;
   System.out.print("\n\tChoice::");
   d=sc.nextInt();
switch(d) 
{
  case 1:
  System.out.println("==============================================================================\n");
  m.read_mag();
  System.out.println("==============================================================================\n");
break;
  case 2:
  System.out.println("==============================================================================\n");
  m.display_mag();
  System.out.println("==============================================================================\n");
break;
  case 3:
  System.out.println("==============================================================================\n");
  System.out.println("HOW MANY COPIES YOU WANT(customer)?? ");
  int n3=sc.nextInt();
  m.sale_copy(n3);
  System.out.println("==============================================================================\n");
break;
  case 4:
  System.out.println("==============================================================================\n");
  System.out.println("ENTER THE NEW ISSUE DATE[dd/mm/yyyy]: ");
  String date=sc.next();
  m.receive_issue(date);
  System.out.println("==============================================================================\n");
break;
}
  System.out.println("DO YOU WANT TO CONTINUE WITH MAGAZINE SECTION [1/0]\n\t1.YES\t0.NO");
  System.out.print("\tChoice::");
  a=sc.nextInt();
 if(a==0)
 break mm;
 }  while(a==1);
}
else if(k==3)
 {
   System.out.println("\n\tTOTAL SALE AMOUNT IS(to be paid bycustomer) = "+(b.getTotal()+m.getTotal())+ " ");
 }
else if(k==4) 
{
  System.out.println("\n\tTOTAL REVENUE OF PUBLICATION IS : "+(b.getCopies()*b.getprice() + m.getCopies()*m.getprice()));
}
else
   System.out.println("invalid key....");
   System.out.println("DO YOU WANT TO CONTINUE WITHPUBLICATION???\n\t1.CONTINUE \t0.TERMINATE");
   outer=sc.nextInt();
}
  while(outer!=0);
  sc.close();
 }
}





















































  























































