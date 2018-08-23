package com.lanif.lesson33.exception;

import com.lanif.lesson33.dto.ErrorInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(Model model, HttpServletRequest request, Exception e) {
        model.addAttribute("exception", e);
        model.addAttribute("url",request.getRequestURL());
        return DEFAULT_ERROR_VIEW;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandle(HttpServletRequest request, Exception e) {
        ErrorInfo<String> info = new ErrorInfo<String>();
        info.setCode(ErrorInfo.ERROR);
        info.setMessage(e.getMessage());
        info.setData("some data");
        info.setUrl(request.getRequestURI());
        return info;
    }
}
