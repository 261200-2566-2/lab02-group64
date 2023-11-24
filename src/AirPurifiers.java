public class AirPurifiers {
    static  int totalAirPurifier = 0 ;
    static  String mostPopularModel;
    static  int mostPopularCount = 0 ;

    String model ;
    String serialNo ;
    boolean power ;
    int speed ;
    int filter_life ;

    AirPurifiers(String model,String serialNo,boolean power,int speed,int filter_life){
        this.model = model ;
        this.serialNo = serialNo ;
        this.power = power ;
        this.speed = speed ;
        this.filter_life = filter_life ;

        totalAirPurifier++ ;
    }

    public void powerOn() {
        power = true ;
        System.out.println("Air Purifier is ON.");
    }
    public void powerOff() {
        power = false ;
        System.out.println("Air Purifier is OFF.");
    }

    public void setSpeed(int speed) {
        if(speed >= 1 && speed <= 5) {
            this.speed = speed ;
            System.out.println("Air Purifier speed set to " + speed);
        } else {
            System.out.println("Invalid speed setting. Speed should be between 1 and 5.");
        }
    }

    public  void replaceFilter() {
        filter_life = 100 ;
        System.out.println("Air Filter has been replaced.");
    }

    public  void run(){
        if(model == "modelXD007lnwza"){
            if(power){
                System.out.println("Air Purifier is running at speed " + speed);
                filter_life -= 5 * speed;
                if(filter_life <= 0) {
                    filter_life = 0 ;
                    System.out.println("Air Filter needs replacement.");
                }
            }else {
                System.out.println("Air Purifier is not powered on.");
            }
        } else if(model == "modelXD007"){
            if(power){
                System.out.println("Air Purifier is running at speed " + speed);
                filter_life -= 3 * speed;
                if(filter_life <= 0) {
                    filter_life = 0 ;
                    System.out.println("Air Filter needs replacement.");
                }
            }else {
                System.out.println("Air Purifier is not powered on.");
            }
        }
    }

    public static void updateMostPopularModel(AirPurifiers airPurifier) {
        if (airPurifier != null) {
            if (mostPopularModel == null || totalAirPurifier == 1) {
                mostPopularModel = airPurifier.model;
                mostPopularCount = 1;
            } else if (airPurifier.model.equals(mostPopularModel)) {
                mostPopularCount++;
            } else if (mostPopularCount > 0) {
                mostPopularCount--;
            } else {
                mostPopularModel = airPurifier.model;
                mostPopularCount = 1;
            }
        }
    }

    public void status(){
        //return " //Model-->" + model + " //SerialNo-->" + serialNo + " //Power-->" + power + " //Speed-->" + speed + " //FilterLife-->" + filter_life + " %" ;
        System.out.println("Air PurifierModel: " + model);
        System.out.println("Serial No: " + serialNo);
        System.out.println("Power: " + power);
        System.out.println("Speed: " + speed);
        System.out.println("Filter Level: " + filter_life + "%");
    }

    public static void displayMostPopularModel() {
        if (mostPopularModel != null && mostPopularCount > 0) {
            System.out.println("Most Popular Model: " + mostPopularModel );
        } else {
            System.out.println("No data available to determine the most popular model.");
        }
    }

    public  static  class Lab02 {
        public static void main(String[] args) {
            // Constructing AirPurifier objects
            AirPurifiers purifier1 = new AirPurifiers("modelXD007lnwza", "A223", false, 1, 100);
            updateMostPopularModel(purifier1);
            AirPurifiers purifier2 = new AirPurifiers("modelXD007lnwza", "A265", true, 2, 45);
            updateMostPopularModel(purifier2);
            AirPurifiers purifier3 = new AirPurifiers("modelXD007", "B117", true, 3, 50);
            updateMostPopularModel(purifier3);

            // Displaying initial states [เริ่มต้น]
            System.out.println("Initial state of Air Purifier 1:");
            purifier1.status();

            System.out.println("\nInitial state of Air Purifier 2:");
            purifier2.status();

            System.out.println("\nInitial state of Air Purifier 3:");
            purifier3.status();

            // Powering on Air Purifiers 1
            purifier1.powerOn();

            // Setting speed for Air Purifiers 2
            purifier2.setSpeed(3);

            // Running Air Purifiers 1, 2, and 3
            System.out.println("\nRunning Air Purifier 1:");
            for (int i = 0; i < 3; i++) {
                purifier1.run();
            }

            System.out.println("\nRunning Air Purifier 2:");
            for (int i = 0; i < 4; i++) {
                purifier2.run();
            }

            System.out.println("\nRunning Air Purifier 3:");
            for (int i = 0; i < 2; i++) {
                purifier3.run();
            }

            // Replacing filter for Air Purifiers 1
            purifier1.replaceFilter();

            // Displaying final states
            System.out.println("\nFinal state of Air Purifier 1:");
            purifier1.status();

            System.out.println("\nFinal state of Air Purifier 2:");
            purifier2.status();

            System.out.println("\nFinal state of Air Purifier 3:");
            purifier3.status();

            // Display the most popular model
            AirPurifiers.displayMostPopularModel();
        }
    }
}