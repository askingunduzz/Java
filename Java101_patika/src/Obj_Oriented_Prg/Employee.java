package Obj_Oriented_Prg;

public class Employee {
    String name;
    double salary;
    int workHours, hireYear;
    double vergi;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            vergi = salary * 3 / 100;
            return vergi;
        }
    }

    int boonus;

    public int bonus() {
        if (workHours > 40) {
            boonus = (workHours - 40) * 30;
            return boonus;
        } else {
            return 0;
        }
    }

    double zam = 0;

    public double raiseSalary() {

        if (hireYear <= 0 || hireYear > 2021) {
            System.out.println("Gecersiz bir calisma yili girdiniz, tekrar kontrol ediniz!");
        } else {
            int year = 2021 - hireYear;
            if (year < 10) {
                zam = salary * 5 / 100;
                return zam;
            } else if (year > 9 && year < 20) {
                zam = salary * 10 / 100;
                return zam;
            } else {
                zam = salary * 15 / 100;
                return zam;
            }
        }
        return 0.0;
    }


    public String toString() {
        double top = salary+ bonus() - tax();
        double maas = raiseSalary() + top;
        System.out.println("Adi: " + name);
        System.out.println("Maasi: " + salary);
        System.out.println("Calisma Saati: " + workHours);
        System.out.println("Baslangic Yili: " + hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maas Artisi: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas: " + top);
        System.out.println("Toplam Maas: " + maas);

        return null;
    }

}
