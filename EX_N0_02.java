public class ex2 {

    // Currency Converter
    static class CurrencyConverter {

        public void dollarToINR(double dollar) {
            System.out.println("Dollar to INR = " + (dollar * 83));
        }

        public void inrToDollar(double inr) {
            System.out.println("INR to Dollar = " + (inr / 83));
        }

        public void euroToINR(double euro) {
            System.out.println("Euro to INR = " + (euro * 90));
        }

        public void inrToEuro(double inr) {
            System.out.println("INR to Euro = " + (inr / 90));
        }

        public void yenToINR(double yen) {
            System.out.println("Yen to INR = " + (yen * 0.56));
        }

        public void inrToYen(double inr) {
            System.out.println("INR to Yen = " + (inr / 0.56));
        }
    }

    // Distance Converter
    static class DistanceConverter {

        public void meterToKM(double meter) {
            System.out.println("Meter to KM = " + (meter / 1000));
        }

        public void kmToMeter(double km) {
            System.out.println("KM to Meter = " + (km * 1000));
        }

        public void milesToKM(double miles) {
            System.out.println("Miles to KM = " + (miles * 1.609));
        }

        public void kmToMiles(double km) {
            System.out.println("KM to Miles = " + (km / 1.609));
        }
    }

    // Time Converter
    static class TimeConverter {

        public void hoursToMinutes(double hours) {
            System.out.println("Hours to Minutes = " + (hours * 60));
        }

        public void minutesToHours(double minutes) {
            System.out.println("Minutes to Hours = " + (minutes / 60));
        }

        public void hoursToSeconds(double hours) {
            System.out.println("Hours to Seconds = " + (hours * 3600));
        }

        public void secondsToHours(double seconds) {
            System.out.println("Seconds to Hours = " + (seconds / 3600));
        }
    }

    public static void main(String[] args) {

        CurrencyConverter c = new CurrencyConverter();
        DistanceConverter d = new DistanceConverter();
        TimeConverter t = new TimeConverter();

        System.out.println("===== Currency Converter =====");
        c.dollarToINR(10);
        c.inrToDollar(830);
        c.euroToINR(5);
        c.inrToEuro(450);
        c.yenToINR(100);
        c.inrToYen(560);

        System.out.println("\n===== Distance Converter =====");
        d.meterToKM(5000);
        d.kmToMeter(5);
        d.milesToKM(10);
        d.kmToMiles(16.09);

        System.out.println("\n===== Time Converter =====");
        t.hoursToMinutes(2);
        t.minutesToHours(120);
        t.hoursToSeconds(2);
        t.secondsToHours(7200);
    }
}
