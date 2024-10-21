
var projectName = '“魅力”繁峙宣传网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的订单',
	url: '../shop-order/list.html'
},

{
	name: '我的地址',
	url: '../shop-address/list.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '繁峙历史',
	url: './pages/fanzhilishi/list.html'
}, 
{
	name: '繁峙名人',
	url: './pages/fanzhimingren/list.html'
}, 
{
	name: '繁峙美食',
	url: './pages/fanzhimeishi/list.html'
}, 
{
	name: '景区景点',
	url: './pages/jingqujingdian/list.html'
}, 
{
	name: '繁峙周边',
	url: './pages/fanzhizhoubian/list.html'
}, 

{
	name: '繁峙论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmd3ysa/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


cartFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"繁峙历史","menuJump":"列表","tableName":"fanzhilishi"}],"menu":"繁峙历史管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"繁峙名人","menuJump":"列表","tableName":"fanzhimingren"}],"menu":"繁峙名人管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"繁峙美食","menuJump":"列表","tableName":"fanzhimeishi"}],"menu":"繁峙美食管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"景区景点","menuJump":"列表","tableName":"jingqujingdian"}],"menu":"景区景点管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"繁峙周边","menuJump":"列表","tableName":"fanzhizhoubian"}],"menu":"繁峙周边管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"繁峙论坛","tableName":"forum"}],"menu":"繁峙论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"资讯","tableName":"news"}],"menu":"系统管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["新增","查看","修改","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["新增","查看","修改","删除"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["新增","查看","修改","删除","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["新增","查看","修改","删除"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["新增","查看","修改","删除"],"menu":"已完成订单","tableName":"orders/已完成"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"繁峙历史列表","menuJump":"列表","tableName":"fanzhilishi"}],"menu":"繁峙历史模块"},{"child":[{"buttons":["查看"],"menu":"繁峙名人列表","menuJump":"列表","tableName":"fanzhimingren"}],"menu":"繁峙名人模块"},{"child":[{"buttons":["查看"],"menu":"繁峙美食列表","menuJump":"列表","tableName":"fanzhimeishi"}],"menu":"繁峙美食模块"},{"child":[{"buttons":["查看"],"menu":"景区景点列表","menuJump":"列表","tableName":"jingqujingdian"}],"menu":"景区景点模块"},{"child":[{"buttons":["查看"],"menu":"繁峙周边列表","menuJump":"列表","tableName":"fanzhizhoubian"}],"menu":"繁峙周边模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["查看"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看","确认收货"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"繁峙历史列表","menuJump":"列表","tableName":"fanzhilishi"}],"menu":"繁峙历史模块"},{"child":[{"buttons":["查看"],"menu":"繁峙名人列表","menuJump":"列表","tableName":"fanzhimingren"}],"menu":"繁峙名人模块"},{"child":[{"buttons":["查看"],"menu":"繁峙美食列表","menuJump":"列表","tableName":"fanzhimeishi"}],"menu":"繁峙美食模块"},{"child":[{"buttons":["查看"],"menu":"景区景点列表","menuJump":"列表","tableName":"jingqujingdian"}],"menu":"景区景点模块"},{"child":[{"buttons":["查看"],"menu":"繁峙周边列表","menuJump":"列表","tableName":"fanzhizhoubian"}],"menu":"繁峙周边模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
