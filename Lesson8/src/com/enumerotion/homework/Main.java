package com.enumerotion.homework;

import java.util.Scanner;


public class Main {
	
	static void menu() {
		
		System.out.println("1 ��� ��������� �� � ����� �����");
		System.out.println("2 ������� �� ����� � ����� ���� ����");
		System.out.println("3 ������� ����� � ���������� ������� ���");
		System.out.println("4 ������� �� ����� �� ����� ����� ������� ���");
		System.out.println("5 ������� �� ����� �� ����� �������� ������� ���");
		System.out.println("6 ������� �������� ���� ����");
		System.out.println("7 ������� ��������� ���� ����");
		System.out.println("8 ������� �� ����� �� ����� ����� ������� ���");
		System.out.println("9 ������� �� ����� �� ����� ������� ������� ���");
		System.out.println("10 �� �������� ����� � ������ �� ����� ������� ���");
	}
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Months [] month  =  Months.values();
		Seasons[] sea2 = Seasons.values();
	
		Scanner scaner = new Scanner (System.in);
		
		while (true) {
			menu();
			
			switch (scaner.next()) {
			
			case"1": {
				System.out.println("������ �����");
				scaner = new Scanner (System.in);
				String months= scaner.next().toUpperCase();
			
					boolean flag = false;
				
					for (Months m : Months.values()) {
					
						if (m.name().equals(months)) {
							System.out.println("true month");
							flag = true;
						}	
					}
					if(!flag) {
						System.out.println("Does not have");
					}
				
				break;
				}
			
			case "2":{
				System.out.println("������ ���� ����");
				scaner = new Scanner (System.in);
				String seasonCs = scaner.next().toUpperCase();
			
					boolean flag = false;
					
					for (Months s : Months.values()) {
						if (s.getSeasons().name().equals(seasonCs)) {
							flag = true;
						}	
					}
					if (flag) {
						Seasons sea = Seasons.valueOf(seasonCs);
						
						for(Months s: month) {
							if(s.getSeasons().toString().equalsIgnoreCase(seasonCs)) {
								System.out.println(s);
								
								}
							}
						}
					if(!flag) {
						System.out.println("Unknown season");
						}
					break;
					}
			
			//������� ����� � ���������� ������� ���
				
			case"3": {
				System.out.println("������ �����");
				scaner = new Scanner (System.in);
				String months = scaner.next().toUpperCase();
		
				boolean flag = false;
				int num = 0;
			
				for (Months ms : Months.values()) {
					
					if (ms.name().equals(months)) {
						num = ms.getDays();
						System.out.println(ms.getDays());
						flag = true;
					} 
				}
				System.out.println("̳���� � ����� ������� ���: ");
				if (flag) {
					for(Months m: month) {
						if( m.getDays() == num) {
							System.out.println(m);
							
							}
						}
					}
				if(!flag) {
					System.out.println("Does not have this month");
				}
			break;
			}
			// �� ����� �� ����� ����� ������� ���
			case"4": {
		System.out.println("����� �� ����� ����� ������� ���");

			for(Months m: month) {
				if(m.getDays() >= 31) {
				System.out.println(m);
							
					}
				}
			break;
			}
			case"5": {
				System.out.println("����� �� ����� �������� ������� ���");

					for(Months m: month) {
						if(m.getDays() < 31) {
						System.out.println(m);
									
							}
						}
			break;
			}
			case"6": {
				System.out.println("������ ���� ����");
				scaner = new Scanner (System.in);
				String seasonCs= scaner.next().toUpperCase();
				
			
				boolean flag = false;
			
				for (Seasons s : sea2) {
					if (s.name().equals(seasonCs)) {
						flag = true;
					}	
				}
				if (flag) {
					Seasons sea = Seasons.valueOf(seasonCs);
					int ordinal = sea.ordinal();
				
						if(ordinal == (sea2.length -1)) {
							ordinal = 0;
							System.out.println(sea2[ordinal]);
						}else {
							System.out.println(sea2[ordinal+1]);
						}
					}
				if(!flag) {
					System.out.println("Unknown season");
					}
				break;
				}
			case"7": {
				System.out.println("������ ���� ����");
				scaner = new Scanner (System.in);
				String seasonCs= scaner.next().toUpperCase();
				
			
				boolean flag = false;
			
				for (Seasons s : sea2) {
					if (s.name().equals(seasonCs)) {
						flag = true;
					}	
				}
				if (flag) {
					Seasons sea = Seasons.valueOf(seasonCs);
					int ordinal = sea.ordinal();
				
						if(ordinal == (sea2.length +1)) {
							ordinal = 0;
							System.out.println(sea2[ordinal ]);
						}else {
							System.out.println(sea2[ordinal-1 ]);
						}
					}
				if(!flag) {
					System.out.println("Unknown season");
					}
				break;
				}
			case"8": {
					for(Months m : Months.values()) {
						if(m.getDays() % 2 == 0 ) {
							System.out.println("������ �����" + m.name());
						}
					}						
			break;	
			}		
			case"9": {
				for(Months m : Months.values()) {
					if(m.getDays() % 2 != 0) {
						System.out.println("�� ������ �����" + m.name());
					}
				}		
				break;
				}
			case"10": {
				System.out.println("������ �����");
				scaner = new Scanner (System.in);
				String months= scaner.next().toUpperCase();
			
					boolean flag = false;
					
					for (Months m : Months.values()) {
						
						if (m.name().equals(months)) {
							flag = true;
						}	
					}
				
					if(flag) {	
						for (Months m : month) {
							
							if (m.name().equals(months.toString()) && m.getDays() %2 == 0) {
								System.out.println("������ ����� "+ m.name().valueOf(months));
								flag = true;
							}else {
								if(m.name().equals(months.toString()) && m.getDays() %2 != 0) {
									System.out.println("�� ������ ����� "+ m.name().valueOf(months));
									flag = true;
								}
							
							
							}
						}
						
					}	
				}
					
				
				break;
				}
			
		}
	}
}



