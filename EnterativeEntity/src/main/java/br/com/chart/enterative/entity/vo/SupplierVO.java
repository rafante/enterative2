package br.com.chart.enterative.entity.vo;

import br.com.chart.enterative.entity.vo.base.UserAwareVO;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author William Leite
 */
public class SupplierVO extends UserAwareVO {

    private static final long serialVersionUID = 1L;

    @Getter @Setter private String name;
    @Getter @Setter private String specVersion;
    @Getter @Setter private String signature;
}
