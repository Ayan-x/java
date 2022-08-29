public class main52 {
    // Finding dish from menu card
    public static int linearsearch(String menu[], String search) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == search) {
                return i;

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String menu[] = { "Samosa", "chole Bhature", "Pastry", "Parathe" };
        String search = "Pastry";

        int index = linearsearch(menu, search);
        if (index == -1) {
            System.out.println(search + " is not present");
        } else {
            System.out.println(menu[index] + " is present and is at number " + (index + 1));
        }
    }
}
