public class StudentStaff_3089 extends Mahasiswa_3089 {
    int unitKerja, jamKerja;
    
    public double totalPendapatan_3089(){
        return (jamKerja * 30000);
    }
    public void tampilDataStudentStaff_3089(){
        super.tampilDataMhs_3089();
        System.out.println(" Unit Kerja : " + unitKerja);
        System.out.println(" Jam Kerja : " +jamKerja);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatan_3089());
    }
}