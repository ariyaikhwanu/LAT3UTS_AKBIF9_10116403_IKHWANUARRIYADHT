package ariya.rockafanna.myselfapps.FragmentDaily;
/*
 * nama : Ikhwanu Arriyadh T
 * kelas : IF9
 * nim ; 10116403
 * Tanggal Pengerjaan : 3 Mei 2019
 *
 * */
public class ListDataDaily {


        private String nama;
        private String npm;
        private String nohp;
        private int gmbr;

        public ListDataDaily(String nama, String npm, String nohp, int gmbr) {
            this.nama = nama;
            this.npm = npm;
            this.nohp = nohp;
            this.gmbr = gmbr;

        }


        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNpm() {
            return npm;
        }

        public void setNpm(String npm) {
            this.npm = npm;
        }

        public String getNohp() {
            return nohp;
        }

        public void setNohp(String nohp) {
            this.nohp = nohp;
        }

        public int getGmbr() {
        return gmbr;
    }

        public void setGmbr(int gmbr)  { this.gmbr = gmbr;}

}
