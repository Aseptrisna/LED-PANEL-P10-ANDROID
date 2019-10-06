package com.kodingindonesia.mycrud;



public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.1.13/Led2019/Api_Android/Tambah_Led.php";
    public static final String URL_GET_ALL = "http://192.168.1.13/Led2019/Api_Android/tampil_Semua_led.php";
    public static final String URL_GET_EMP = "http://192.168.1.13/Led2019/Api_Android/tampil_Led.php?id_panel=";
    public static final String URL_UPDATE_EMP = "http://192.168.1.13/Led2019/Api_Android/Update_Led.php";
    public static final String URL_DELETE_EMP = "http://192.168.1.13/Led2019/Api_Android/Hapus_Led.php?id_panel=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_ID = "id_panel";
    public static final String KEY_PESAN= "isi_pesan";
    public static final String KEY_LOKASI= "lokasi_led";
    public static final String KEY_TANGGAL= "tanggal";//desg itu variabel untuk posisi

//
    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id_panel";
    public static final String TAG_PESAN= "isi_pesan";
    public static final String TAG_LOKASI= "lokasi_led";
    public static final String TAG_TANGGAL= "tanggal";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "id_panel";
}
