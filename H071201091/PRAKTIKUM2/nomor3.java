/**
 * nomor3
 */
public class nomor3 {

    public static void main(String[] args) {
        int menuIndex = 0;
        int subMenuIndex = 0;
        boolean isValidRole = false;

        if (args.length == 0) {
            System.out.println("What role you want to see ?");
            System.out.println("For example, try 'Admin'.");
        }
        else if (args.length == 1) {
            if (args[0].equals("Super Admin")) {
                menuIndex++;
                System.out.printf("\n%d. Super Admin\n",menuIndex);
                subMenuIndex++;
                System.out.printf(" %d. %d. CRUD Super Admin\n", menuIndex, subMenuIndex);
                subMenuIndex++;
                System.out.printf(" %d. %d. CRUD Admin\n", menuIndex, subMenuIndex);
                subMenuIndex++;
                System.out.printf(" %d. %d. CRUD User\n", menuIndex, subMenuIndex);
                menuIndex++;
                System.out.printf("\n%d. Admin\n",menuIndex);
                subMenuIndex=1;
                System.out.printf(" %d. %d. CRUD Admin\n", menuIndex, subMenuIndex);
                subMenuIndex++;
                System.out.printf(" %d. %d. CRUD User\n", menuIndex, subMenuIndex);
                menuIndex++;
                System.out.printf("\n%d. User\n",menuIndex);
                subMenuIndex=1;
                System.out.printf(" %d. %d. View\n", menuIndex, subMenuIndex);
                subMenuIndex++;
                System.out.printf(" %d. %d. Edit\n", menuIndex, subMenuIndex);
            } 
            else if (args[0].equals("Admin")){
                menuIndex=1;
                System.out.printf("\n%d. Admin\n",menuIndex);
                subMenuIndex=1;
                System.out.printf(" %d. %d. CRUD Admin\n", menuIndex, subMenuIndex);
                subMenuIndex++;
                System.out.printf(" %d. %d. CRUD User\n", menuIndex, subMenuIndex);
                menuIndex++;
                System.out.printf("\n%d. User\n",menuIndex);
                subMenuIndex=1;
                System.out.printf(" %d. %d. View\n", menuIndex, subMenuIndex);
                subMenuIndex++;
                System.out.printf(" %d. %d. Edit\n", menuIndex, subMenuIndex);
            }
            else if (args[0].equals("User")){
                menuIndex=1;
                System.out.printf("\n%d. User\n",menuIndex);
                subMenuIndex=1;
                System.out.printf(" %d. %d. View\n", menuIndex, subMenuIndex);
                subMenuIndex++;
                System.out.printf(" %d. %d. Edit\n", menuIndex, subMenuIndex);
            }
            else {
                System.out.println(isValidRole);
                System.out.println("Valid Role : Super Admin, Admin, User");
            }
        } 
        else {
            System.out.println("Too many argument");
        }
    }
}