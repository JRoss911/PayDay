package rocks.zipcode;

/**
 * rocks.zipcode.PayDay
 *
 * input: "Kris", 21.5, 10.0, 0.05
 * output: "Kris 215.00 10.75 204.25”
 */
public class PayDay {
    public void main(String[] args) {
        PayDay payday = new PayDay();

        StringBuilder outputReport = new StringBuilder();
        outputReport.append("PayDayReport for this week\n\n");

        // create an array of TimeCards that have this weeks data in it.
        // each timeCard object contains the data for one person.
        TimeCard[] cards = payday.createRunData();

        for (TimeCard card : cards) {
            String n = card.getName();
            double w = card.getHoursWorked();
            // ... etc for the other 2 fields
            double r = card.getHourlyRate();
            double d = card.getDeductionRate();

            // you need to change the parameters on the method to take the input!
            String result = payday.pay(n, r, w, d);

            outputReport.append(result);
            outputReport.append("\n");
        }

        System.out.println(outputReport.toString());


    }
    /**
     * Takes four parameters:
     * "Kris", 21.5, 10.0, 0.05
     * <p>
     * Notice the data type of each of the four.
     */
    public String pay(String n, double hourlyRate, double hoursWorked, double deductionRate) {
        return result;

    }
        double grossPay = rate * worked;
        double deduction = grossPay * deduct;
        double netPay = grossPay - deduction;
        String result = String.format("%s%.2f%.2f%.2f", n, grossPay, deduction, netPay);
        return ;

}
    /**
     * for the example of how the *pay* method might be used to create a text report
     *
     */
    private class TimeCard {
        private String name;
        private double hoursWorked;
        private double hourlyRate;
        private double deductionRate;

        public TimeCard(String n, double r, double w, double d) {
            this.name = "";
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
            this.deductionRate = deductionRate;
        }


        public String getName() {
            return name;
        }

        public double getHoursWorked() {
            return hoursWorked;
        }

        public double getHourlyRate() {
            return hourlyRate;
        }

        public double getDeductionRate() {
            return deductionRate;
        }



        public TimeCard[] createRunData() {
            TimeCard[] cards = {
                    new TimeCard("Kris", 21.5, 10.0, 0.05),
                    new TimeCard("Dolio", 23.0, 12.0, 0.05),
                    new TimeCard("Karen", 22.0, 12.0, 0.05),
            };
            return cards;
        }
    }

