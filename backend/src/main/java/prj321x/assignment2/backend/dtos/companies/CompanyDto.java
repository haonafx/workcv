package prj321x.assignment2.backend.dtos.companies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import prj321x.assignment2.backend.entities.companies.Company;

import java.io.Serializable;

/**
 * DTO for {@link Company}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class CompanyDto implements Serializable {
    private Integer id;
    private String address;
    private String description;
    private String email;
    private String logo;
    private String name;
    private String phoneNumber;
}