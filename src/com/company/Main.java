//Airline: пункт назначения,номер рейса, тип самолета,время вылета, дни недели
//Создать массив объектов. Вывести: а) список рейсов для заданного пункта назначения
//b) список рейсов для заданного дня недели
//c) список рейсов для заданного дня недели,время вылета для которых больше заданного
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Airline airlines[] = new Airline[4];
        airlines[0] = new Airline("Chicago", "Boeing", 9.00, "Monday", 406);
        airlines[1] = new Airline("Ankara", "Boeing", 14.00, "Monday", 211);
        airlines[2] = new Airline("Chicago", "Airbus", 6.00, "Friday", 456);
        airlines[3] = new Airline("Samara", "Boeing", 2.00, "Monday", 963);

        System.out.println("Список рейсов для заданного пункта назначения: ");
        String dest = sc.nextLine();
        for (int i = 0; i <4 ; i++) {
            if(airlines[i].getDestination().equals(dest)){
                System.out.println(airlines[i].toString());
            }
        }
        System.out.println("Список рейсов для заданного дня недели: ");
        String weekday = sc.nextLine();
        for (int i = 0; i <4 ; i++) {
            if(airlines[i].getDay().equals(weekday)){
                System.out.println(airlines[i].toString());
            }
        }
        System.out.println("Время после:");
       double hour= sc.nextDouble();
        for (int i = 0; i < 4 ; i++) {
            if(hour < airlines[i].getTime()){
                System.out.println(airlines[i].toString());
            }
        }

    }
}

class Airline {
    private String destination, type, day;
    double time;
             int FlightNumber;

    public Airline(String dest, String type, double time, String day, int FlightNumber) {
        this.destination = dest;
        this.type = type;
        this.time = time;
        this.day = day;
        this.FlightNumber = FlightNumber;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String dest) {
        this.destination = dest;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getTime() {
        return time;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public int getFlightNumber() {
        return FlightNumber;
    }
    public void setFlightNumber(int FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    public String toString() {
        return "Airline{ " +
                " Destination= " + destination +
                ", Type = '" + type + '\'' +
                ", Time = '" + time + '\'' +
                ", Day = '" + day + '\'' +
                ", FlightNumber='" + FlightNumber + '\'' +
                '}';
    }

}
