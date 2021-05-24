package br.com.chart.enterative.vo.search;

import br.com.chart.enterative.enums.PRODUCT_TEXT_TYPE;
import br.com.chart.enterative.vo.base.NamedVO;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author William Leite
 */
public class ProductTextSearchVO extends NamedVO {

    private static final long serialVersionUID = 1L;

    @Getter @Setter private PRODUCT_TEXT_TYPE type;
}
