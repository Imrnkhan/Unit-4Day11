package Question1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Library> a = new HashSet<>();

        try {
            while (true) {

                System.out.println("Enter book Id");
                int id = Integer.parseInt(sc.nextLine());

                System.out.println("Enter book name");
                String bookName = sc.nextLine();
                System.out.println("Enter book Author");
                String authorName = sc.nextLine();

                System.out.println("Do you want add(y/n");
                String option = sc.nextLine();
                Library l = new Library(bookName, authorName, id);
                a.add(l);

                if (option.equalsIgnoreCase("n")) {
                    break;
                }
            }

            int i = 1;
            for (Library l : a) {
                System.out.println("------------------");
                System.out.println("Book details:" + (i++));
                System.out.println("-------------------");
                System.out.println("book id:" + l.getBookId());
                System.out.println("book name:" + l.getBookName());
                System.out.println("Book author:" + l.getBookAuthor());
            }

            TreeSet<LibraryManagement> addMember = new TreeSet<>();
            System.out.println("-----------------");
            System.out.println("Do you want to add anu member(y/n");

            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                return;
            } else {
                int memberId;

                String memberName;
                String memberShip;
                String memberShipEnd;

                while (true) {
                    System.out.println("enter menber if");
                    String mmberId = sc.nextLine();

                    System.out.println("Enter member name");
                    String mmberName = sc.nextLine();

                    System.out.println("Enter memberShip end date:(yyy-MM-dd");
                    String endDate = sc.nextLine();

                    LocalDate d1 = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    LibraryManagement am = new LibraryManagement();
                    addMember.add(am);

                    System.out.println("Do you want add anyone(y/n");
                    String option = sc.nextLine();

                    if (option.equalsIgnoreCase("n")) {
                        break;
                    }
                }

                for (LibraryManagement xm : addMember) {
                    System.out.println("----------------");
                    System.out.println("member Id" + xm.getMemberId());
                    System.out.println("member Name" + xm.getMemberName());
                    System.out.println("MemberShip" + xm.getMemberShipEndDate());
                }
            }
        } catch (DateTimeException d) {
            // TODO: handle exception
            System.out.println("Enter valid format");
        } catch (NumberFormatException n) {
            System.out.println("enter number not string");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
