/**
 * demo.js
 * http://www.codrops.com
 *
 * Licensed under the MIT license.
 * http://www.opensource.org/licenses/mit-license.php
 * 
 * Copyright 2016, Codrops
 * http://www.codrops.com
 */
;(function(window) {

	'use strict';

	// taken from mo.js demos
	function isIOSSafari() {
		var userAgent;
		userAgent = window.navigator.userAgent;
		return userAgent.match(/iPad/i) || userAgent.match(/iPhone/i);
	};

	// taken from mo.js demos
	function isTouch() {
		var isIETouch;
		isIETouch = navigator.maxTouchPoints > 0 || navigator.msMaxTouchPoints > 0;
		return [].indexOf.call(window, 'ontouchstart') >= 0 || isIETouch;
	};
	
	// taken from mo.js demos
	var isIOS = isIOSSafari(),
		clickHandler = isIOS || isTouch() ? 'touchstart' : 'click';

	function extend( a, b ) {
		for( var key in b ) { 
			if( b.hasOwnProperty( key ) ) {
				a[key] = b[key];
			}
		}
		return a;
	}

	function Animocon(el, options) {
		this.el = el;
		this.options = extend( {}, this.options );
		extend( this.options, options );

		this.checked = false;

		this.timeline = new mojs.Timeline();
		
		for(var i = 0, len = this.options.tweens.length; i < len; ++i) {
			this.timeline.add(this.options.tweens[i]);
		}

		var self = this;
		this.el.addEventListener(clickHandler, function() {
			if( self.checked ) {
				self.options.onUnCheck();
			}
			else {
				self.options.onCheck();
				self.timeline.replay();
			}
			self.checked = !self.checked;
		});
	}

	Animocon.prototype.options = {
		tweens : [
			new mojs.Burst({})
		],
		onCheck : function() { return false; },
		onUnCheck : function() { return false; }
	};

	// grid items:
	var items = [].slice.call(document.querySelectorAll('ol.grid > .grid__item'));

	function init() {
		/* Icon 4 */
		var el4 = items[0].querySelector('button.icobutton'), el4span = el4.querySelector('svg');
		var scaleCurve4 = mojs.easing.path('M0,100 L25,99.9999983 C26.2328835,75.0708847 19.7847843,0 100,0');
		new Animocon(el4, {
			tweens : [
				// burst animation
				new mojs.Burst({
					parent: 	el4,
					count: 		6,
					radius: 	{40:120},
					children: {
						fill : 		[ '#988ADE', '#DE8AA0', '#8AAEDE', '#8ADEAD', '#DEC58A', '#8AD1DE' ],
						opacity: 	0.6,
						radius: 	20,
						direction: [ -1, -1, -1, 1, -1 ],
						swirlSize: 'rand(10, 14)',
						duration: 1500,
						easing: 	mojs.easing.bezier(0.1, 1, 0.3, 1),
						isSwirl: 	true
					}
				}),
				// ring animation
				new mojs.Shape({
					parent: 			el4,
					radius: 			50,
					scale: 				{ 0 : 1 },
					fill: 				'transparent',
					stroke: 			'#988ADE',
					strokeWidth: 	{15:0},
					opacity: 			0.6,
					duration: 		750,
					easing: 			mojs.easing.bezier(0, 1, 0.5, 1)
				}),
				// icon scale animation
				new mojs.Tween({
					duration : 900,
					onUpdate: function(progress) {
						var scaleProgress = scaleCurve4(progress);
						el4span.style.WebkitTransform = el4span.style.transform = 'scale3d(' + scaleProgress + ',' + scaleProgress + ',1)';
					}
				})
			],
			onCheck : function() {
				el4.style.filter = "none";
			},
			onUnCheck : function() {
				el4.style.filter = "gray";	
			}
		});
		/* Icon 4 */

	
		
	}
	
	init();

})(window);