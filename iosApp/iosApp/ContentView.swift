import SwiftUI
import WebKit
import shared

struct ComposeView: UIViewControllerRepresentable {
	func makeUIViewController(context: Context) -> UIViewController {
		return Platform_iosKt.mainViewController()
	}

	func updateUIViewController(_ uiViewController: UIViewController, context: Context) {
    }
}

struct ContentView: View {
	let greet = Greeting().greet()
	
	var body: some View {
		ComposeView()
			.ignoresSafeArea(.keyboard) // Compose has own keyboard handler
//        WKWebViewPractice(url: "https://www.naver.com")
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
