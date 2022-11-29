public class AsistenPraktikum_3089 extends Mahasiswa_3089 {
    String mkAsisten_3089;
    int jmlPertemuan_3089;
    
    public double totalPendapatan_3089(){
        return(jmlPertemuan_3089 * 50000);
    }
    public void tampilDataAsistenPraktikum_3089() {
        super.tampilDataMhs_3089();
        System.out.println(" Mata Kuliah    : " + mkAsisten_3089);
        System.out.println(" Jumlah Pertemuan   : " + jmlPertemuan_3089);
        System.out.println(" Total Pendapatan : " + totalPendapatan_3089());
        
        
    }
}
