package co.chrisman.android_meetup3;

import org.androidannotations.annotations.rest.Accept;
import org.androidannotations.annotations.rest.Post;
import org.androidannotations.annotations.rest.RequiresHeader;
import org.androidannotations.annotations.rest.Rest;
import org.androidannotations.api.rest.MediaType;
import org.androidannotations.api.rest.RestClientHeaders;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * Created by chrismac on 7/30/15.
 */
@Rest(rootUrl = "http://54.197.234.235/android-meetup3-backend-1.0/rest/service", converters = {FormHttpMessageConverter.class, MappingJackson2HttpMessageConverter.class, StringHttpMessageConverter.class})
public interface ServiceClient extends RestClientHeaders {

    @Post("/login")
    @RequiresHeader("Content-Type")
    @Accept(MediaType.TEXT_PLAIN)
    String login(LoginRequest request);

}
