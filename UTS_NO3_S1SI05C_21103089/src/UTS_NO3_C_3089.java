import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UTS_NO3_C_3089 {

    public static void main(String[] args) {
        //Membuat object menggunakan array
        AsistenPraktikum_3089[] AsPrak_3089 = new AsistenPraktikum_3089[1];
        StudentStaff_3089[] StuStaff_3089 = new StudentStaff_3089[1];
        
        AsPrak_3089[0] = new AsistenPraktikum_3089();
        StuStaff_3089[0] = new StudentStaff_3089();

        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data nelayan
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                AsPrak_3089[i].nim_3089 = br.readLine();
                System.out.print("Nama             : ");
                AsPrak_3089[i].nama_3089 = br.readLine();
                System.out.print("Jurusan          : ");
                AsPrak_3089[i].jurusan_3089 =br.readLine();
                System.out.print("IPK              : ");
                AsPrak_3089[i].ipk_3089 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                AsPrak_3089[i].mkAsisten_3089 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                AsPrak_3089[i].jmlPertemuan_3089 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data nelayan
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3089 AP : AsPrak_3089){
                AP.tampilDataAsistenPraktikum_3089();
                System.out.println("");
            }

            //mengisi data ke array pada data dokter
            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                StuStaff_3089[i].nim_3089 = br.readLine();
                System.out.print("Nama        : ");
                StuStaff_3089[i].nama_3089 = br.readLine();
                System.out.print("Jurusan     : ");
                StuStaff_3089[i].jurusan_3089 =br.readLine();
                System.out.print("IPK         : ");
                StuStaff_3089[i].ipk_3089 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                StuStaff_3089[i].unitKerja = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                StuStaff_3089[i].jamKerja = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data dokter
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3089 SS : StuStaff_3089){
                SS.tampilDataStudentStaff_3089();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
    }
}
