class Tp2Nomor3{
    public static void main(String[] arg) {
        int menuIndex = 0;
        int subMenuIndex = 0;
        boolean isValidRole = false;

        if (arg.length == 0){
            System.out.println("what role you want to see ?");
            System.out.println("for example, try admin");
        }else if (arg.length == 1){
            if(arg[0].equals("Super Admin")){
                menuIndex += 1;
                System.out.printf("%d. Super Admin\n", menuIndex);
                subMenuIndex += 1;
                System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex, subMenuIndex);
                subMenuIndex += 1;
                System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                subMenuIndex += 1;
                System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, subMenuIndex);
                menuIndex += 1;
                System.out.printf("%d. Admin\n", menuIndex);
                subMenuIndex = 1;
                System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                subMenuIndex += 1;
                System.out.printf("%2d.%d. CRUD User\n\n",menuIndex, subMenuIndex);
                menuIndex += 1;
                System.out.printf("%d. User\n", menuIndex);
                subMenuIndex = 1;
                System.out.printf("%2d.%d View\n", menuIndex, subMenuIndex);
                subMenuIndex +=1;
                System.out.printf("%2d.%d Edit\n", menuIndex, subMenuIndex);
            } else if(arg[0].equals("Admin")){
                menuIndex = 2;
                System.out.printf("%d. Admin\n", menuIndex);
                subMenuIndex =1;
                System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                subMenuIndex +=1;
                System.out.printf("%2d.%d. CRUD User\n\n",menuIndex, subMenuIndex);
                menuIndex +=1;
                System.out.printf("%d. User\n", menuIndex);
                subMenuIndex = 1;
                System.out.printf("%2d.%d View\n", menuIndex, subMenuIndex);
                subMenuIndex += 1;
                System.out.printf("%2d.%d Edit\n", menuIndex, subMenuIndex); 
            } else if(arg[0].equals("User")){
                menuIndex=3;
                System.out.printf("%d. User\n", menuIndex);
                subMenuIndex = 1;
                System.out.printf("%2d.%d View\n", menuIndex, subMenuIndex);
                subMenuIndex +=1;
                System.out.printf("%2d.%d Edit\n", menuIndex, subMenuIndex); 
            } else {
                System.out.println("invalid role");
                System.out.println("valid role : Super Admin, Admin, User");
            }
        } else {
            System.out.println("To many argumet");
        }
    }
}