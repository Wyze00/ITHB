import javax.swing.JOptionPane;

public class Soal3 {
    
    public static void main(String[] args) {

        Double gaji = Double.valueOf(JOptionPane.showInputDialog("Masukkan gaji"));
        Integer tahun = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Tahun"));
        Double kenaikanGaji = Double.valueOf(JOptionPane.showInputDialog("Masukkan kenaikan gaji (%)")) / 100 + 1;
        
        double hasil = 0;

        Double tempGaji = gaji;

        while (tahun != 0){

            tempGaji = gaji;
            double totalGaji = (12 * gaji) - 54_000_000;

            int counter = 1;

            while(counter != 5 && totalGaji > 0){

                if(counter == 1){

                    if(totalGaji <= 50_000_000){
                        hasil = hasil + totalGaji*0.05;
                        totalGaji -= 50_000_000;

                    } else {
                        hasil = hasil + 50_000_000 * 0.05;
                        totalGaji -= 50_000_000;
                    }

                } else if(counter == 2){

                    if(totalGaji <= 250_000_000){
                        hasil = hasil + totalGaji*0.15;
                        totalGaji -= 250_000_000;

                    } else {
                        hasil = hasil + 250_000_000 * 0.15;
                        totalGaji -= 250_000_000;
                    }
                    
                } else if(counter == 3){

                    if(totalGaji <= 500_000_000){
                        hasil = hasil + totalGaji*0.25;
                        totalGaji -= 500_000_000;

                    } else {
                        hasil = hasil + 500_000_000 * 0.25;
                        totalGaji -= 500_000_000;
                    }

                } else if(counter == 4){
                        hasil = hasil + totalGaji*0.3;
                }
                counter++;
            }

            gaji = tempGaji * kenaikanGaji;

            tahun--;
        }

        JOptionPane.showMessageDialog(null, hasil);
        System.out.printf("%.4f",hasil);
    }
}
