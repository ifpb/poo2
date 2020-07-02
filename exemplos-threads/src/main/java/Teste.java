import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args) {
		
		try {
			List<String> linhas = Files.lines(Paths.get(ClassLoader.getSystemResource("alunos.csv").toURI()))
					.skip(100)
					.limit(50)
					.collect(Collectors.toList());
			
			for(String linha: linhas) {
				Files.write(Paths.get("/tmp/processados.csv"), (linha+"\n").getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
	
}
