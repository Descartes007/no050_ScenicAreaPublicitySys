import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import discussjingqujingdian from '@/views/modules/discussjingqujingdian/list'
    import discussfanzhimingren from '@/views/modules/discussfanzhimingren/list'
    import storeup from '@/views/modules/storeup/list'
    import fanzhilishi from '@/views/modules/fanzhilishi/list'
    import fanzhizhoubian from '@/views/modules/fanzhizhoubian/list'
    import discussfanzhimeishi from '@/views/modules/discussfanzhimeishi/list'
    import users from '@/views/modules/users/list'
    import fanzhimeishi from '@/views/modules/fanzhimeishi/list'
    import forum from '@/views/modules/forum/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import fanzhimingren from '@/views/modules/fanzhimingren/list'
    import orders from '@/views/modules/orders/list'
    import discussfanzhizhoubian from '@/views/modules/discussfanzhizhoubian/list'
    import config from '@/views/modules/config/list'
    import discussfanzhilishi from '@/views/modules/discussfanzhilishi/list'
    import jingqujingdian from '@/views/modules/jingqujingdian/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '资讯',
        component: news
      }
          ,{
	path: '/discussjingqujingdian',
        name: '景区景点评论',
        component: discussjingqujingdian
      }
          ,{
	path: '/discussfanzhimingren',
        name: '繁峙名人评论',
        component: discussfanzhimingren
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/fanzhilishi',
        name: '繁峙历史',
        component: fanzhilishi
      }
          ,{
	path: '/fanzhizhoubian',
        name: '繁峙周边',
        component: fanzhizhoubian
      }
          ,{
	path: '/discussfanzhimeishi',
        name: '繁峙美食评论',
        component: discussfanzhimeishi
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/fanzhimeishi',
        name: '繁峙美食',
        component: fanzhimeishi
      }
          ,{
	path: '/forum',
        name: '繁峙论坛',
        component: forum
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/fanzhimingren',
        name: '繁峙名人',
        component: fanzhimingren
      }
          ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
          ,{
	path: '/discussfanzhizhoubian',
        name: '繁峙周边评论',
        component: discussfanzhizhoubian
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/discussfanzhilishi',
        name: '繁峙历史评论',
        component: discussfanzhilishi
      }
          ,{
	path: '/jingqujingdian',
        name: '景区景点',
        component: jingqujingdian
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
