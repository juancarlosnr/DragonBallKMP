//
//  HomeScreen.swift
//  iosApp
//
//  Created by Juan Carlos on 13/10/25.
//

import SwiftUI
import Shared
import KMPObservableViewModelSwiftUI
import KMPNativeCoroutinesAsync

struct HomeScreen: View {
    
    @StateViewModel
    var homeViewModel = HomeViewModel()
    
    var body: some View {
        Text(homeViewModel.example)
    }
}

#Preview {
    HomeScreen()
}
