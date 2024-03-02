package tn.firas.springsecurity.payload.response;


import lombok.Builder;
import tn.firas.springsecurity.exception.ErrorCodes;


import java.util.List;
@Builder
public record ErrorResponse(
        Integer httpCode,

        ErrorCodes code,

        String message,

        List<String> errors

) {

}
