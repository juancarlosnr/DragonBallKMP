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
    var homeViewModel = HomeViewModel(repository: DiHelper().repository)
    
    var body: some View {
        if !homeViewModel.characters.isEmpty {
            LazyVStack{
                ForEach(homeViewModel.characters,id:\.self){
                    character in
                    Text(character.name)
                }
            }
        }else{
            Text("Error")
        }
    }
}

#Preview {
    HomeScreen()
}
