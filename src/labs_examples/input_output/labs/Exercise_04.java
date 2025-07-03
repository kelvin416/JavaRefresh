package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */
class Exercise04 {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        String filePath = "src/labs_examples/input_output/labs/cars.csv";
        String writePath = "src/labs_examples/input_output/labs/cars_write.csv";


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;

            while ((line = br.readLine()) != null){
                String[] values = line.split(",");
                cars.add(mapValuesToCarObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Car car : cars){
            System.out.println(car.toString());
        }

        //Writing back the objects back to a new CSV file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(writePath))){
            bw.write("year,make,carCompany,passenger,price");
            bw.newLine();

            for (Car car : cars){
                bw.write(car.getYear()+ "," + car.getMake() + "," + car.getCarCompany() + "," +
                        car.getPassengers() + "," + car.getPrice());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Car mapValuesToCarObject(String[] values){
        Car car = new Car();

        car.setYear(Integer.parseInt(values[0]));
        car.setMake(values[1]);
        car.setCarCompany(values[2]);
        car.setPassengers(Integer.parseInt(values[3]));
        car.setPrice(Double.parseDouble(values[4]));

        return car;
    }
}

class Car{

    private int year;
    private String make;
    private String carCompany;
    private int passengers;
    private double price;

    public Car(){}

    public Car(int year, String make, String carCompany, int passengers, double price) {
        this.year = year;
        this.make = make;
        this.carCompany = carCompany;
        this.passengers = passengers;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", carCompany='" + carCompany + '\'' +
                ", passengers=" + passengers +
                ", price=" + price +
                '}';
    }
}

