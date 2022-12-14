package co.develhope.Interceptor.Middleware2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Month {

    private int id;
    private String englishName;
    private String italianName;
    private String germanName;
}

