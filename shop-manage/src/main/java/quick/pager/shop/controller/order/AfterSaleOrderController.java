package quick.pager.shop.controller.order;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import quick.pager.shop.constants.Constants;
import quick.pager.shop.response.Response;

@Api(description = "售后")
@RestController
@RequestMapping(Constants.Module.MANAGE)
public class AfterSaleOrderController {

    @PostMapping("/order/after/sale")
    public Response afterSale() {
        return null;
    }
}
