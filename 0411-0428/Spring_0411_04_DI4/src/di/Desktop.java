package di;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
	public String getInfo() {
		return "dt";
	}
}
