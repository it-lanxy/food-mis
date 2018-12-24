var MD = {
    maidan : function (id) {
        jQuery("#"+id).html(
            '<iframe style="border:0;height: 100%;width: 100%" src="/foodmis/maidan/orderlist"/>'
        )
    },
    dingdan : function (id) {
        jQuery("#"+id).html(
            '<iframe style="border:0;height: 100%;width: 100%" src="http://mis.sankuai.com/mis/hui/maitonOrderQuery?type=123&queryType=1"/>'
        )
    }
}