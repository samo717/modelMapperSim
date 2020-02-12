import static org.assertj.core.api.Assertions.assertThat;

import com.stev.modelmapper.modelmapperdemo.source.A;
import com.stev.modelmapper.modelmapperdemo.source.B;
import com.stev.modelmapper.modelmapperdemo.source.C;
import org.junit.Before;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;

public class MapperTest {

	private ModelMapper modelMapper = new ModelMapper();

	@Before
	public void initialiseMapper() {
		modelMapper.getConfiguration()
				.setFieldMatchingEnabled(true)
				.setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
	}

	@Test
	public void shouldMapAllFieldsTest() {
		A source = new A()
				.var1(new B()
						.var1("MCICA")
						.var2("ClientID")
						.var3(new C())
				);

		com.stev.modelmapper.modelmapperdemo.target.A target = modelMapper.map(source, com.stev.modelmapper.modelmapperdemo.target.A.class);

		assertThat(source.getVar1().getVar3()).isNotNull();
		assertThat(target.getVar1().getVar3()).isNotNull();
	}
}
