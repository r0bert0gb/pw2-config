package pw2.roberto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/config")
public class Config {

	@ConfigProperty(name = "Ifrs.pw2", defaultValue = "")
	String instituicao;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String OlaMundo() {

		return "String usando config: " + instituicao;
	}
}
