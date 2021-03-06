package scaffold.demo.api.v1.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * the DTO for example
 *
 * @author fangzhibin
 */
@Data
@ApiModel
public class ScaffoldDTO {

  private Long id;

  private String name;
}