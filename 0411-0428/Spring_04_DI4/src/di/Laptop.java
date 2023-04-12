package di;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
	public String getInfo() {
		return "laptop";
	}
}
