package com.ug3.soal1;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 
public class App 
{
    public static void main( String[] args )
    {
		Scanner user_input = new Scanner (System.in);
		
		String nama_karyawan;
        System.out.print( "Absen Disini");
		System.out.print( "Nama Karyawan");
		nama_karyawan = user_input.next();
		
		System.out.print("berhasil absensi");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
    }
}
