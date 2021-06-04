package com.steven.uts_akb_myselfapps;
/*
*Tanggal Pengerjaan : 4 juni 2021
Nim : 10118078
Nama : Steven Danesswaralay
email : Steven.10118078@mahasiswa.unikom.ac.id
Kelas : IF-2 */
public class MainModel {
    Integer img_friend;
    String keterangan;

    public MainModel(Integer img_friend,String keterangan){
        this.img_friend = img_friend;
        this.keterangan = keterangan;


    }
    public Integer getImg_friend(){
        return img_friend;
    }

    public String getKeterangan() {
        return keterangan;
    }
}
