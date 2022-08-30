package HackerRank.TimeConversion;

public class TimeConversionChallenge {


    public static void main(String[] args) {
        String time = "12:00:00AM";
        String time24 = convertTo24HrTimeFormat(time);

        System.out.println(time24);
    }

    private static String convertTo24HrTimeFormat(String time) {

        StringBuilder time24 = new StringBuilder(time);
        String hr24 = "";
        String period24 = "";


        String hr = time.substring(0,2);
        String period = time.substring(8,10);



        if(period.equalsIgnoreCase("AM")){

            hr24 = hr;

            if(hr.equalsIgnoreCase("12"))
                hr24 = "00";

            time24.replace(0,2, hr24);
            time24.replace(8,10, period24);
        }


        if(period.equalsIgnoreCase("PM")){

            if(hr.equalsIgnoreCase("12"))
                hr24 = hr;

            if(Integer.parseInt(hr) < 12 )
                hr24 = String.valueOf((12 + Integer.parseInt(hr)));

            time24.replace(0,2, hr24);
            time24.replace(8,10, period24);
        }



       return time24.toString();
    }
}

