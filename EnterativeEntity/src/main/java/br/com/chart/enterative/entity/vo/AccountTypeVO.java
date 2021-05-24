package br.com.chart.enterative.entity.vo;

import br.com.chart.enterative.entity.vo.base.UserAwareVO;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author William Leite
 */
public class AccountTypeVO extends UserAwareVO {

    private static final long serialVersionUID = 1L;

    @Getter @Setter private Boolean commissionable;
    @Getter @Setter private BigDecimal initialDeposit;

}
