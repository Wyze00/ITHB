public class Soal1 {    
    
    public static void main(String[] args) {

        City city1 = new City("Bandung", "Jawa Barat", 1.1243, -1.934);
        City.printCity(city1);
    }
}

class City {
    String nama, provinsi;
    double latitude, longitude;

    City(String nama, String provinsi, double  latitude, double  longitude){
        this.nama = nama;
        this.provinsi = provinsi;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    static void printCity(City place){
        System.out.println("Nama : " + place.nama);
        System.out.println("Provinsi : " + place.provinsi);
        System.out.println("Longitude : " + place.longitude);
        System.out.println("Latitude : " + place.latitude);
    }
}
