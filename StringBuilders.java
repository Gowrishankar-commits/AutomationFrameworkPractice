import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringBuilders {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(name);
		String reversed = sb.reverse().toString();
		System.out.println(reversed);
	}
		

}
