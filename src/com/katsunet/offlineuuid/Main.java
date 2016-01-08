package com.katsunet.offlineuuid;

import java.util.UUID;

public class Main {
	public static void main(String[] args) {
		if(args.length==1){
			System.out.print(UUID.nameUUIDFromBytes(("OfflinePlayer:" + args[0]).getBytes()));
		}
	}
}
