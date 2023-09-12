//NOTE: Using java for the first time today 2023-09-12

public class Program {
    public static void main(String[] args) {

        printBonusDatesBetween(2011, 2025);
    }

    public static void printBonusDatesBetween(int fromYear, int toYear) {

        int startingMonth = 1;
        int startingDay = 1;

        //year iteration
        for (int year = fromYear; year <= toYear; year++) {
            //month iteration
            for (int month = startingMonth; month <= 12; month++) {

                //day iteration
                for (int day = startingDay; day <= 31; day++) {
                    String dateString = year + "-";

                    if(month < 10){
                        dateString += "0" + month + "-";
                    }else {
                        dateString += month + "-";
                    }

                    if(day < 10){
                        dateString += "0" + day;
                    }else{
                        dateString += "" + day;
                    }

                    if(isDateStringPalindrome(dateString)){
                        System.out.println(dateString);
                    }
                }
            }
        }
    }

    public static boolean isDateStringPalindrome(String dateString) {
        String reversedDateString = new StringBuilder(dateString).reverse().toString();

        return dateString.replace("-", "").equals(
                reversedDateString.replace("-", ""));
    }
}

//P.S. Sadly this year the Sourcery academy is on-site only :(
//I will not be able to make it since I live ~240km from Kaunas and I have a job...
//Well, at least I tried java for the first time! It was a fun evening to do this little program.
//Please give me feedback on the code <3
