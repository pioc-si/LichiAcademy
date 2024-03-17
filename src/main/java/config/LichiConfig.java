package config;

import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:src/main/resources/config.properties"
})
public interface LichiConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("loginEmail")
    String loginEmail();

    @Key("loginPassword")
    String loginPassword();

    @Key("errorLoginText")
    String errorLoginText();

    @Key("profileUrl")
    String profileUrl();

}