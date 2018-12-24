var TG = {
    dingdan : function (id) {
        $("#"+id).html(
            '<iframe style="border:0;height: 100%;width: 100%" src="http://order.sankuai.com/mis/order/"/>'
        )
    },
    tuikuan : function (id) {
        jQuery("#"+id).html(
            '<iframe style="border:0;height: 100%;width: 100%" src="http://10.32.97.203:8415/mis/"/>'
        )
    }
}