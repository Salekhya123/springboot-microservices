package net.javaguides.springboot.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
    public ErrorDetails(LocalDateTime now, String message2, String description, String string) {
		// TODO Auto-generated constructor stub
	}
	private LocalDateTime timestamp;
    private String message;
    private String path;
    private String errorCode;
}