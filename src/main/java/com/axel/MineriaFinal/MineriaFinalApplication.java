package com.axel.MineriaFinal;

import com.axel.MineriaFinal.Entity.TemasCaso;
import com.axel.MineriaFinal.Utils.ReaderCSV;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MineriaFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MineriaFinalApplication.class, args);
		ReaderCSV.red("/home/leonaxico/Downloads/linea-mujeres.csv",",");
	}

}
