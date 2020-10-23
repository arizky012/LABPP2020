class Role{
    public static void main(String[] args){
       int menuIndex = 0;
       int submenuIndex = 0;
       boolean isValidRole = false;

       if (args.length == 0){
           System.out.println("Choose The Role!");
           System.out.println("for example, try 'admin'.");
       }else if (args.length == 1){

       }else if (args[0].equals("admin")){
           System.out.println("Bernapas");
       }
    }
}